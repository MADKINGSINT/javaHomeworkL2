

    package java_homework_l;
    
    import java.io.BufferedReader;
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.IOException;
    
    public class task_3 {
        public static String getLineOffile(String fileName) {
            String fileString = null;
            try {
                File file = new File(fileName);
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                fileString = reader.readLine();
    
                reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    
            return fileString;
        }
    
        private static String[][] splitFile(String split) {
            String line = split.substring(1, split.length() - 1);
    
            String[] splitString = line.split(", ");
    
            String[][] array = new String[splitString.length][3];
            for (int i = 0; i < splitString.length; i++) {
                line = splitString[i].substring(1, splitString[i].length() - 1);
                for (int j = 0; j < 3; j++) {
                    String[] min = line.split(",");
                    String[] micro = min[j].split(":");
                    array[i][j] = micro[1].substring(1, micro[1].length() - 1);
    
                }
            }
            return array;
        }
    
        private static String[] gluing_strings(String[][] arraystr) {
            String[] gluing_str = new String[arraystr.length];
            StringBuilder answerString = new StringBuilder();
            for (int i = 0; i < arraystr.length; i++) {
                answerString.append("Студент ");
                answerString.append(arraystr[i][0]);
                answerString.append(" получил  ");
                answerString.append(arraystr[i][1]);
                answerString.append(" по предмету ");
                answerString.append(arraystr[i][2]);
                gluing_str[i] = answerString.toString();
                answerString.delete(0, answerString.length());
            }
            return gluing_str;
        }
    
        public static void main(String[] args) {
            String file = getLineOffile("java_homework_l/task_3.txt");
            System.out.println(file);
            String[] array = gluing_strings(splitFile(file));
            for (int i = 0; i < array.length; i++)
                System.out.println(array[i]);
        }
    }
    