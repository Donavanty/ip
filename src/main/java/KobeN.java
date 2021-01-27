import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import parser.Parser;
import TaskList.TaskList;
import Ui.Ui;
import Storage.storage;
import Commands.Commands;

public class KobeN {
    private Storage storage;
    private TaskList tasks; //ArrayList<Tasks> tasks
    private Ui ui;
    private static final String HOME = System.getProperty("user.home");


    public KobeN(String filePath) {
        ui = new Ui();
        tasks = new TaskList();
        storage = new Storage(filePath, tasks);
    }


    public static void main(String[] args) {
        Path path = Paths.get(HOME + "/ip/src/main/data/kobe.txt");
        new KobeN(path).run();
    }

    public void run() {
        //Scanner things
        Scanner sc = new Scanner(System.in);

        try {
            while (sc.hasNext()) {
                //Read the whole line, dissect each command word, including the condition after "/"
                String command = sc.nextLine();

                //---Parser---
                Parser.readInput(command, tasks, storage, ui);
            }
        } catch (CustomExceptions.IncompleteDecriptionException e) {
            System.out.println(e);
        } catch (CustomExceptions.IncorrectDecriptionException e) {
            System.out.println(e);
        }

        sc.close();

    }


}