package habittracker;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Locale;

// import calagories from org.apache.poi 
// Maven project and environment set 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelManager {
    public static void createHabitStorage(){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("HabitStorage");
        XSSFRow row;

        row = sheet.createRow(0);

        Cell habit_name = row.createCell(0, CellType.STRING);
        Cell repeat_monday = row.createCell(1,CellType.BOOLEAN);
        Cell repeat_tuesday = row.createCell(2,CellType.BOOLEAN);
        Cell repeat_wednesday = row.createCell(3,CellType.BOOLEAN);
        Cell repeat_thursday = row.createCell(4,CellType.BOOLEAN);
        Cell repeat_friday = row.createCell(5,CellType.BOOLEAN);
        Cell repeat_saturday = row.createCell(6,CellType.BOOLEAN);
        Cell repeat_sunday = row.createCell(7,CellType.BOOLEAN);


        // Set all values neede 
        /* 
         * Set all values and headers to habit storage excel file
         * Values included (format: value name, type, definition)
         * 1. habit name, boolean, the name of current habit located
         * 2. true & false, boolean, if habit is tracked by true or false method then true, else is false
         * 3. checklist, boolean, if habit is tracked by checklist method then true, else is false
         * 4. unit, boolean, if habit is tracked by unit method then true, else is false. 
         * 5. repeat mondy, if habit is repeat every monday then true, else if false
         * 6. repeat tuesday, if habit is repeat every tuesday then true, else is false.
         * 7. repeat wednesday, if habit is repeat every wednesday then true, else is false. 
         * 8. repeat thursday, if habit is repeat every 
         * 
        */
        habit_name.setCellValue("habit name");
        repeat_monday.setCellValue("repeat monday");
        repeat_tuesday.setCellValue("repeat tuesday");
        repeat_wednesday.setCellValue("repeat wednesday");
        repeat_thursday.setCellValue("repeat thursday");
        repeat_friday.setCellValue("repeat friday");
        repeat_saturday.setCellValue("repeat saturday");
        repeat_sunday.setCellValue("repeat sunday");

        try {
            FileOutputStream out = new FileOutputStream(new File("habit_storage.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("habit storage created sucessfully");
        } catch (FileNotFoundException ex){
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param HabitName
     * @param Repeat_monday
     * @param Repeat_tuesday
     * @param Repeat_wednesday
     * @param Repeat_thursday
     * @param Repeat_friday
     * @param Repeat_saturday
     * @param Repeat_sunday
     */
    public static void createNewHabit(String HabitName,boolean Repeat_monday,
    boolean Repeat_tuesday,
    boolean Repeat_wednesday,
    boolean Repeat_thursday,
    boolean Repeat_friday,
    boolean Repeat_saturday,
    boolean Repeat_sunday){

      XSSFWorkbook workbook = new XSSFWorkbook();
      XSSFSheet sheet = workbook.createSheet(HabitName);
      XSSFRow row;
      row = sheet.createRow(0);

      Cell weekStartDate = row.createCell(0, CellType.STRING);
      Cell monday = row.createCell(1, CellType.BOOLEAN);
      Cell tuesday = row.createCell(2, CellType.BOOLEAN);
      Cell wednesday = row.createCell(3, CellType.BOOLEAN);
      Cell thursday = row.createCell(4, CellType.BOOLEAN);
      Cell friday = row.createCell(5, CellType.BOOLEAN);
      Cell saturday = row.createCell(6, CellType.BOOLEAN);
      Cell sunday = row.createCell(7, CellType.BOOLEAN);
      
      weekStartDate.setCellValue("weekStartDate");
      monday.setCellValue("monday");
      tuesday.setCellValue("tuesday");
      wednesday.setCellValue("wednesday");
      thursday.setCellValue("thursday");
      friday.setCellValue("friday");
      saturday.setCellValue("saturday");
      sunday.setCellValue("sunday");

      try {
          FileOutputStream out = new FileOutputStream(new File(HabitName+".xlsx"));
          workbook.write(out);
          out.close();
          System.out.println("new Habit data file created sucessfully");
      } catch (FileNotFoundException ex){
          ex.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
    }
    /**
     * @param HabitName
     * @param Repeat_monday
     * @param Repeat_tuesday
     * @param Repeat_wednesday
     * @param Repeat_thursday
     * @param Repeat_friday
     * @param Repeat_saturday
     * @param Repeat_sunday
     * @throws IOException
     */
    public static void inserthabit( String HabitName,
                                    boolean Repeat_monday,
                                    boolean Repeat_tuesday,
                                    boolean Repeat_wednesday,
                                    boolean Repeat_thursday,
                                    boolean Repeat_friday,
                                    boolean Repeat_saturday,
                                    boolean Repeat_sunday) throws IOException{

        FileInputStream file = new FileInputStream("habit_storage.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int lastrow = sheet.getLastRowNum();
        int row_number = 0;

      for (int i = 0;i<lastrow+1;i++,row_number++) {
        
        if (sheet.getRow(i).getCell(0).toString()==""){
          System.out.println("break rownum : "+row_number);
          System.out.println("break i num  : "+i);
          break;
          
        } 
        System.out.println("rownum : "+row_number);
        System.out.println("i num  : "+i);
      } 
      Row row = sheet.getRow(row_number);
      if (row == null){
        row = sheet.createRow(lastrow+1);
      }
        Cell habit_name = row.createCell(0, CellType.STRING);
        Cell repeat_monday = row.createCell(1,CellType.BOOLEAN);
        Cell repeat_tuesday = row.createCell(2,CellType.BOOLEAN);
        Cell repeat_wednesday = row.createCell(3,CellType.BOOLEAN);
        Cell repeat_thursday = row.createCell(4,CellType.BOOLEAN);
        Cell repeat_friday = row.createCell(5,CellType.BOOLEAN);
        Cell repeat_saturday = row.createCell(6,CellType.BOOLEAN);
        Cell repeat_sunday = row.createCell(7,CellType.BOOLEAN);
        

        habit_name.setCellValue(HabitName);
        repeat_monday.setCellValue(Repeat_monday);
        repeat_tuesday.setCellValue(Repeat_tuesday);
        repeat_wednesday.setCellValue(Repeat_wednesday);
        repeat_thursday.setCellValue(Repeat_thursday);
        repeat_friday.setCellValue(Repeat_friday);
        repeat_saturday.setCellValue(Repeat_saturday);
        repeat_sunday.setCellValue(Repeat_sunday);
        
        FileOutputStream outFile = new FileOutputStream("habit_storage.xlsx");
        workbook.write(outFile);
        outFile.close();
        System.out.println("Value inserted successfully");
        file.close();
    }
    
    public static void editHabit(String habitName,
    String editedHabitName,
    boolean Repeat_monday,
    boolean Repeat_tuesday,
    boolean Repeat_wednesday,
    boolean Repeat_thursday,
    boolean Repeat_friday,
    boolean Repeat_saturday,
    boolean Repeat_sunday) throws IOException{

      FileInputStream file = new FileInputStream("habit_storage.xlsx");
      XSSFWorkbook workbook = new XSSFWorkbook(file);
      XSSFSheet sheet = workbook.getSheetAt(0);
      // check where habit is located
      Row row  = sheet.getRow(-1);

      for (Row r : sheet){
        if (r.getCell(0).toString().equals(habitName)){
          System.out.println(habitName+"found successfully");
          row  = r;
          break;
        }
      }
      if (row == null) {
        System.out.println("Habit not found");
        return;
      }

      Cell habit_name = row.createCell(0, CellType.STRING);
      Cell repeat_monday = row.createCell(1,CellType.BOOLEAN);
      Cell repeat_tuesday = row.createCell(2,CellType.BOOLEAN);
      Cell repeat_wednesday = row.createCell(3,CellType.BOOLEAN);
      Cell repeat_thursday = row.createCell(4,CellType.BOOLEAN);
      Cell repeat_friday = row.createCell(5,CellType.BOOLEAN);
      Cell repeat_saturday = row.createCell(6,CellType.BOOLEAN);
      Cell repeat_sunday = row.createCell(7,CellType.BOOLEAN);

      habit_name.setCellValue(editedHabitName);
      repeat_monday.setCellValue(Repeat_monday);
      repeat_tuesday.setCellValue(Repeat_tuesday);
      repeat_wednesday.setCellValue(Repeat_wednesday);
      repeat_thursday.setCellValue(Repeat_thursday);
      repeat_friday.setCellValue(Repeat_friday);
      repeat_saturday.setCellValue(Repeat_saturday);
      repeat_sunday.setCellValue(Repeat_sunday);
      
      FileOutputStream outFile = new FileOutputStream("habit_storage.xlsx");
      workbook.write(outFile);
      outFile.close();
      System.out.println("Value edited successfully");
      file.close();



    }

    public static void inserttest(){
      try {
        FileInputStream file = new FileInputStream("habit_storage.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(1);
        Cell cell = row.createCell(1);

        cell.setCellValue("new value");

        FileOutputStream outFile = new FileOutputStream("habit_storage.xlsx");
        workbook.write(outFile);
        outFile.close();
        System.out.println("Value inserted successfully");
        file.close();

      } catch (IOException e){
        e.printStackTrace();
      }
    }

    public static void deletehabit(String habitName) throws IOException{
      FileInputStream file = new FileInputStream("habit_storage.xlsx");
      XSSFWorkbook workbook = new XSSFWorkbook(file);
      XSSFSheet sheet = workbook.getSheetAt(0);
      // check where habit is located
      
      Row rowToDelete  = sheet.getRow(-1);

      for (Row r : sheet){
        if (r.getCell(0).toString().equals(habitName)){
          System.out.println(habitName+"found successfully");
          rowToDelete  = r;
          break;
        }
      }
      if (rowToDelete == null) {
        System.out.println("Habit not found");
        return;
      }
      int deleteRowIndex = rowToDelete.getRowNum();
      sheet.removeRow(rowToDelete);
      System.out.println("Last row number : "+sheet.getLastRowNum());
      System.out.println("delete row number : "+deleteRowIndex);

      if (sheet.getLastRowNum()!=0){
        sheet.shiftRows(deleteRowIndex + 1, sheet.getLastRowNum(), -1);
      }

      FileOutputStream outFile = new FileOutputStream("habit_storage.xlsx");
      workbook.write(outFile);
      outFile.close();
      System.out.println("Habit delete successfully");
      file.close();

      deleteHabitFile(habitName);
    }

    private static void deleteHabitFile(String habitName){
      // Specify the name of the Excel file that you want to delete
      String fileName = habitName+".xlsx";

      // Get the current working directory of the project
      String projectDirectory = System.getProperty("user.dir");

      // Construct the file path of the Excel file using the project directory
      String filePath = projectDirectory + File.separator + fileName;

      // Create a file object with the specified file path
      File file = new File(filePath);

      // Check if the file exists
      if (file.exists()) {
          // Delete the file
          file.delete();

          // Print a message to confirm that the file has been deleted
          System.out.println("File deleted successfully.");
      } else {
          // Print a message to indicate that the file does not exist
          System.out.println("File does not exist.");
      }
    }

    public static ArrayList<String> readHabitList() throws IOException{
      FileInputStream file = new FileInputStream("habit_storage.xlsx");
      XSSFWorkbook workbook = new XSSFWorkbook(file);
      XSSFSheet sheet = workbook.getSheetAt(0);
      int rowNumber = 0;
      ArrayList<String> habitNames = new ArrayList<String>();
      for (Row row : sheet){
        if (rowNumber>0){
          Cell cell = row.getCell(0);
          System.out.println(cell.toString());
          habitNames.add(cell.toString());
        }
        rowNumber++;
      }

      file.close();
      workbook.close();
      return habitNames;
    }

    public static ArrayList<Boolean> readHabitEnableDay(String habitName) throws IOException{
      FileInputStream file = new FileInputStream("habit_storage.xlsx");
      XSSFWorkbook workbook = new XSSFWorkbook(file);
      XSSFSheet sheet = workbook.getSheetAt(0);
      ArrayList<Boolean> habitEnableDay = new ArrayList<Boolean>();
      
      for (Row row : sheet){
        if (row.getCell(0).toString().equals(habitName)){
          System.out.println(habitName+"found successfully");
          for (int cellnumber = 1; cellnumber<=7; cellnumber++){
            System.out.println(cellnumber+" : "+row.getCell(cellnumber).toString());
            habitEnableDay.add(row.getCell(cellnumber).getBooleanCellValue());
          }
          break;
        }
      }

      file.close();
      workbook.close();
      return habitEnableDay;

    }
    
    public static void insertHabitTrack(String habitName, LocalDate date, 
    Boolean monChecked,
    Boolean tueChecked,
    Boolean wedChecked,
    Boolean thuChecked,
    Boolean friChecked,
    Boolean satChecked,
    Boolean sunChecked
    ) throws IOException{
      FileInputStream file = new FileInputStream(habitName+".xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int lastrow = sheet.getLastRowNum();
        boolean dateAlreadyExist = false;
        Row row = sheet.getRow(0);
        System.out.println("habit open successfully");

      

        for (int r = 1;r<lastrow+1;r++){
          LocalDate weekStart = LocalDate.parse(sheet.getRow(r).getCell(0).toString());
          WeekFields weekFields = WeekFields.of(Locale.getDefault());
          int weekNumberToCheck = date.get(weekFields.weekOfWeekBasedYear());
          int weekNumberStart = weekStart.get(weekFields.weekOfWeekBasedYear());
          dateAlreadyExist = weekNumberToCheck == weekNumberStart;
          
          if (dateAlreadyExist){
            System.out.println("is the same week : "+dateAlreadyExist);
            row = sheet.getRow(r);
          }
        }


      if (dateAlreadyExist==false){
        System.out.println("date does not exist in data, creating new row");
        row = sheet.createRow(lastrow+1);
        LocalDate monday = date.with(TemporalAdjusters.previousOrSame(java.time.DayOfWeek.MONDAY));
        row.createCell(0,CellType.BOOLEAN).setCellValue(monday.toString());
      }

        Cell mon = row.createCell(1,CellType.BOOLEAN);
        Cell tue = row.createCell(2,CellType.BOOLEAN);
        Cell wed = row.createCell(3,CellType.BOOLEAN);
        Cell thu = row.createCell(4,CellType.BOOLEAN);
        Cell fri = row.createCell(5,CellType.BOOLEAN);
        Cell sat = row.createCell(6,CellType.BOOLEAN);
        Cell sun = row.createCell(7,CellType.BOOLEAN);

        mon.setCellValue(monChecked);
        tue.setCellValue(tueChecked);
        wed.setCellValue(wedChecked);
        thu.setCellValue(thuChecked);
        fri.setCellValue(friChecked);
        sat.setCellValue(satChecked);
        sun.setCellValue(sunChecked);
        
        FileOutputStream outFile = new FileOutputStream(habitName+".xlsx");
        workbook.write(outFile);
        outFile.close();
        System.out.println("Value inserted successfully");
        file.close();
        
    }

    public static ArrayList<Boolean> getThisWeekTrackData(String habitName) throws IOException{
        FileInputStream file = new FileInputStream(habitName+".xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int lastrow = sheet.getLastRowNum();
        boolean dateAlreadyExist = false;
        Row row = sheet.getRow(0);
        ArrayList<Boolean> trackData = new ArrayList<Boolean>();
        System.out.println("habit trackdata file open successfully");

        for (int r = 1;r<lastrow+1;r++){
          LocalDate weekStart = LocalDate.parse(sheet.getRow(r).getCell(0).toString());
          WeekFields weekFields = WeekFields.of(Locale.getDefault());
          int weekNumberToCheck = LocalDate.now().get(weekFields.weekOfWeekBasedYear());
          int weekNumberStart = weekStart.get(weekFields.weekOfWeekBasedYear());
          dateAlreadyExist = weekNumberToCheck == weekNumberStart;
          
          if (dateAlreadyExist){
            System.out.println("is the same week : "+dateAlreadyExist);
            for (int day = 1;day<8;day++){
              System.out.println("Day "+day+" : "+sheet.getRow(r).getCell(day).getBooleanCellValue());
              trackData.add(sheet.getRow(r).getCell(day).getBooleanCellValue());
              
            }

          }
        }

      if (dateAlreadyExist==false){
        System.out.println("date does not exist, creating new row");
        row = sheet.createRow(lastrow+1);
        LocalDate monday = LocalDate.now().with(TemporalAdjusters.previousOrSame(java.time.DayOfWeek.MONDAY));
        row.createCell(0,CellType.BOOLEAN).setCellValue(monday.toString());
        for (int day = 1;day<8;day++){
          trackData.add(false);
        }
      }

      FileOutputStream outFile = new FileOutputStream(habitName+".xlsx");
      workbook.write(outFile);
      outFile.close();
      System.out.println("got track data");
      file.close();

      return trackData;
    }
}
