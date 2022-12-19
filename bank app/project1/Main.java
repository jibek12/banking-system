import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;
import java.net.SocketOption;
import java.util.*;


//Workers Autorization //Log in
class Login {
    class Banksystem {

        private static void main(String args[]) throws IOException {
            System.out.println("Sign up please");
            chooseUsers();
        }
        public static String chooseUsers() throws IOException {
            Scanner sc = new Scanner(System.in);

            System.out.println("Choose your acconunt:");
            System.out.println("(1) Admin");
            System.out.println("(2) Cooperator");
            System.out.println("(3) Accountent");
            do {
                System.out.print("Yoyr choice: ");
                String choose = sc.nextLine();
                switch (choose) {
                    case "Admin":
                    case "admin":
                    case "1":
                        System.out.println("Welcome admin");
                        System.out.println("Enter your login and password");
                        directorInputLgPw();
                        break;
                }
                case "Cooperator":
                case "cooperator":
                case "2":
                    System.out.println("Welcome cooperator");
                    System.out.println("Enter your login and password");
                    workerInputLgPw();
                    break;
                case "Accontent":
                case "accountentr":
                case "3":
                    System.out.println("Welcome Accountent");
                    System.out.println("Enter your login and password");
                    deliverymanInputLgPw();
                    break;
                default;
                    System.out.print("Do you want log out?");
                    int ex = sc.nextInt();
                    if (ex == 0){
                        chooseUsers();
                    }
                    else if(ex == 1){
                        System.exit(0);
                    }
            }
            break;
        } while (true);
            return "";
    }
    //admin authorization
    public static void directorInputLgPw() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("Admin");
        loginArrayList.add("Cooperator");
        loginArrayList.add("Accountent");
        passwordArrayList.add("Admin1");
        passwordArrayList.add("Cooperator1");

        do {
            System.out.print("Enter your login: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your passsword: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Successfully logged in!");
                directorActions();
                break;
            } else {
                System.out.println("Try again");
            }
        } while (true);
    }
    // Cooperator autorization
    public static void workerInputLgPw() throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("Cop");
        passwordArrayList.add("Cop1");

        do {
            System.out.print("Enter your login: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {

                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Successfully logged in!");
                Menu();
                break;
            } else {
                System.out.println("Try again");
            }
        } while (true);
    }


    // Accountent autorization
    public static void deliverymanInputLgPw() throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("Acc");

        passwordArrayList.add("Acc1");

        do {
            System.out.print("Enter your login: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;

            if (haveInArray == true) {
                System.out.println("Successfully logged in!");
                deliverymanActions();
                break;
            } else {
                System.out.println("Try again.");
            }
        } while (true);
    }


    // Accountent autorization
    public static void deliverymanInputLgPw() throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("Acc");

        passwordArrayList.add("Acc1");

        do {
            System.out.print("Enter your login: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;

            if (haveInArray == true) {
                System.out.println("Successfully logged in!");
                deliverymanActions();
                break;
            } else {
                System.out.println("Try again.");
            }
        } while (true);
    }

    //Workers actions
    public static void AdminActions() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("(1)Show all accounts");
        System.out.println("(2)Show all customer names");
        System.out.println("(3)Show all customer accounts");
        System.out.println("(4)Show how much money was withdrown this month");
        System.out.println("(5)quarterly report");
        System.out.println("(0)Log out");
        do {
            System.out.print("Your choice: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction) {
                case "action1":
                case "Action1":
                case "1":
                    System.out.println("Action 1");
                    action1();
                    directorActions();
                    break;
                case "action2":
                case "Action2":
                case "2":
                    System.out.println("Action 2");
                    action2();
                    directorActions();
                    break;
                case "action3":
                case "Action3":
                case "3":
                    System.out.println("Action 3");
                    action3();
                    directorActions();
                    break;
                case "action4":
                case "Action4":
                case "4":
                    System.out.println("Action 4");
                    action4();
                    directorActions();
                    break;
                case "action5":
                case "Action5":
                case "5":
                    System.out.println("Action 5");
                    action5();
                    directorActions();
                    break;
                default:
                    System.out.println("There is no such action in the program");
                    directorActions();
                    break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "action0":
                case "Action0":
                case "0":
                    System.out.println("Log out");
                    break;
            }
            break;
        } while (true);
    }
    public static void action1() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:"));
            while (br.ready()) {
                System.out.print(br.readLine() + " ");
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void action2() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:"));
            int count = 0;
            while (br.ready()) {
                br.readLine();
                count++;
            }
            BufferedReader br1 = new BufferedReader(new FileReader("C:"));
            int count1 = 0;
            while (br1.ready()) {
                br1.readLine();
                count1++;
            }
            System.out.println("All accounts= " + (int) (count + count1));
            br1.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void action3() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:"));
            HashMap<String, Integer> d = new HashMap<>();
            while (br.ready()) {
                String line = br.readLine();
                if (d.containsKey(line)) {
                    d.put(line, (int) (d.get(line) + 1));
                } else {
                    d.put(line, 1);
                }
            }

            System.out.println(d);
            String s = "dsd";
            int m = 0;
            for (String i : d.keySet()) {
                if (d.get(i) > m) {
                    m = d.get(i);
                    s = i;
                }
            }
            System.out.println("all customer names" + s);
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void action4() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:"));
            HashMap<String, Integer> d = new HashMap<>();
            while (br.ready()) {
                String line = br.readLine();
                if (d.containsKey(line)) {
                    d.put(line, (int) (d.get(line) + 1));
                } else {
                    d.put(line, 1);
                }
            }
            System.out.println(d);
            String s = "dsd";
            int m = 100;
            for (String i : d.keySet()) {
                if (d.get(i) < m) {
                    m = d.get(i);
                    s = i;
                }
            }
            System.out.println(":"+ s);
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action5() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:"));
            System.out.print("quarterly report");
            int countLine = 0;
            while (br.ready()) {
                System.out.print(br.readLine() + ", ");
                countLine++;
            }
            System.out.println(" = " + countLine);
            BufferedReader br1 = new BufferedReader(new FileReader("C:"));
            System.out.print(" ");
            int countline = 0;
            while (br1.ready()) {
                System.out.print(br1.readLine() + "all customer accounts");
                countline++;
            }
            System.out.println("All money withdrown this month = " + countline);
            br1.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    //         Cooperator action
    public static void Menu() throws IOException{
        System.out.println("1. Paper work");
        System.out.println("2. Sale of sacurities");
        System.out.println("3. Cashier work");
        System.out.println("4.Recalculasion ");
        System.out.println("5. issurance of money");
        System.out.println("6. money ransfer");
        System.out.println("7.Buying currency");
        System.out.println("8. Selling currency");
        System.out.println("9. Log out");
        ShowMenu();
    }
    public static void ShowMenu() throws IOException{
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("(To see menu again, click [0]) Enter-->");
            var action = input.nextLine();
            switch(action){
                case "0": Menu(); break;
                case "1": ShowFullList(); break;
                case "2": Search(); break;
                case "3": ShowReport(); break;
                case "4": Order(); break;
                case "5": OrderList(); break;
                case "6": Lack(); break;
                case "7": Discount(); break;
                case "8": Delete(); break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "9": exit(); break;
                default: System.out.print("Enter menu's number.");
            }
        }
    }
    private static void ShowFullList() throws FileNotFoundException, IOException{
        try {
            FileInputStream file= new FileInputStream(new File("C:"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()){
                Row row = rowIterator.next();
                for(var colIndex = 0; colIndex < 3; colIndex += 2)
                {
                    Cell cell = row.getCell(colIndex);
                    switch (cell.getCellType()){
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.printf("%.0f", cell.getNumericCellValue());
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue()+ "\t\t");
                            break;
                    }
                }
                System.out.println();
            }
            file.close();
        }
        catch(Exception e){
            System.out.println("Smth is wrong!");
        }
    }

    private static void Search() throws FileNotFoundException, IOException{
        Scanner input = new Scanner(System.in);
        FileInputStream file= new FileInputStream(new File("C:"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        System.out.print("Enter your codeword-->");
        String search = input.nextLine();
        Iterator<Row> rowIterator = sheet.iterator();
        while(rowIterator.hasNext()){
            Row row = rowIterator.next();
            var name = row.getCell(0);
            var sernum = row.getCell(1);
            if(name.getStringCellValue().trim().equals(search) || sernum.getStringCellValue().trim().equals(search))
            {
                Iterator<Cell> cellIterator = row.cellIterator();
                while(cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()){
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.printf("%.0f", cell.getNumericCellValue());
                            System.out.print("\t\t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue()+ "\t\t");
                            break;
                    }
                }
                System.out.println();
            }

        }
        file.close();
    }
    private static void ShowReport(){
        try {
            FileInputStream file= new FileInputStream(new File("C:"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()){
                Row row = rowIterator.next();
                for(var colIndex = 0; colIndex < 5; colIndex += 2)
                {
                    Cell cell = row.getCell(colIndex);
                    switch (cell.getCellType()){
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.printf("%.0f", cell.getNumericCellValue());
                            System.out.print("\t\t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue()+ "\t\t");
                            break;
                    }
                }
                System.out.println();
            }
            file.close();
        }
        catch(Exception e){
            System.out.println("Smth is wrong!");
        }
    }
    private static void Order(){
        String path = "C:";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            Scanner input = new Scanner(System.in);

            do{
                System.out.print("Enter amount of money that you whant to withdraw-->");
                String thing = input.nextLine();
                if(thing==null || StringUtils.isEmpty(thing.trim())){
                    break;
                }

//Accountent action

                public static void deliverymanActions() throws IOException {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Menu:");
                    System.out.println("(1)Customer list for this month");
                    System.out.println("(2)Quarterly reports.");
                    System.out.println("(3)Number of dollars.");
                    System.out.println("(4)Number of open cards.");
                    System.out.println("(5)Emploee earnings.");
                    System.out.println("(6)My earnings.");
                    System.out.println("(0)Log out");
                    do {
                        System.out.print("Ваш выбор: ");
                        String chooseAction = sc.nextLine();
                        switch (chooseAction) {
                            case "n":
                                try{
                                    Bybhu.chooseUsers();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            case "action1":
                            case "Action1":
                            case "1":

                                try (BufferedReader br = new BufferedReader(new FileReader(""))) {
                                    String line = null;
                                    while ((line = br.readLine()) != null) {
                                        System.out.println(line);
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                deliverymanActions();
                                break;

                            case "action2":
                            case "Action2":
                            case "2":

                                try (BufferedReader br = new BufferedReader(new FileReader(""))) {
                                    String line = null;
                                    while ((line = br.readLine()) != null) {
                                        System.out.println(line);
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                deliverymanActions();
                                break;

                            case "action3":
                            case "Action3":
                            case "3":
                                System.out.println("Action 3");

                                ArrayList<String> appliances = new ArrayList<String>();
                                try (BufferedReader br = new BufferedReader(new FileReader(""))) {
                                    String line = null;
                                    while ((line = br.readLine()) != null) {
                                        appliances.add(line);
                                    }
                                    System.out.println(appliances);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                                try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:", true))) {
                                    String i = "";
                                    bw.write(i);
                                    if (i.equals(i)) {
                                        bw.close();
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                try (BufferedWriter bw = new BufferedWriter(new FileWriter("", true))) {
                                    int i = 0;
                                    while (i <= appliances.size()) {
                                        if (i == appliances.size()) {
                                            bw.close();
                                            System.out.println("It's done!");
                                            break;
                                        } else {
                                            bw.newLine();
                                            bw.write(appliances.get(i));
                                            i++;
                                        }
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                deliverymanActions();
                                break;

                            case "action4":
                            case "Action4":
                            case "4":

                                try {

                                    File myFile = new File("");
                                    FileReader fileReader = new FileReader(myFile);
                                    LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

                                    int lineNumber = 0;

                                    while (lineNumberReader.readLine() != null) {
                                        lineNumber++;
                                    }

                                    System.out.println(lineNumber);

                                    lineNumberReader.close();

                                    String lineNumber1 = String.valueOf(lineNumber);
                                    File newFile = new File("");
                                    FileWriter fileWriter = new FileWriter(newFile);
                                    fileWriter.write(lineNumber1 + "");
                                    fileWriter.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                deliverymanActions();
                                break;


                            case "action5":
                            case "Action5":
                            case "5":
                                try {

                                    File myFile = new File("C:");
                                    FileReader fileReader = new FileReader(myFile);
                                    LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

                                    int lineNumber = 0;

                                    while (lineNumberReader.readLine() != null) {
                                        lineNumber++;
                                    }

                                    System.out.println(lineNumber);

                                    lineNumberReader.close();

                                    String lineNumber1 = String.valueOf(lineNumber);
                                    File newFile = new File("");
                                    FileWriter fileWriter = new FileWriter(newFile);
                                    fileWriter.write(lineNumber1 + ": " + "C:");
                                    fileWriter.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                deliverymanActions();
                                break;

                            case "action6":
                            case "Action6":
                            case "6":
                                int count = 0;

                                try {
                                    // create a new file object
                                    File file = new File("C:");

                                    // create an object of Scanner
                                    // associated with the file
                                    Scanner mn = new Scanner(file);

                                    // read each line and
                                    // count number of lines
                                    while (mn.hasNextLine()) {
                                        mn.nextLine();
                                        count++;
                                    }
                                    System.out.println("Total Number of Customers: " + count);
                                    System.out.println("Your Data: " + count * 2000);
                                    // close scanner
                                    mn.close();
                                } catch (Exception e) {
                                    e.getStackTrace();
                                }

                                deliverymanActions();
                                break;

                            default:
                                System.out.println("There is no such action in the program!");
                                deliverymanActions();
                                break;

                            case "action0":
                            case "Action0":
                            case "0":
                                System.out.println("Log out");
                                break;

                        }
                        break;
                    } while (true);
                }
            }

