package pl.sda.files.simple;

class App {
    public static void main(String args[]){
        SimpleFileReader reader = new SimpleFileReader();
        reader.readFile("C:\\Users\\Filip\\Documents\\GitHub\\SDA_J19_Files\\src\\main\\resources\\simple.txt");

        SimpleFileWriter writer = new SimpleFileWriter();
        writer.write("Moja zawartosc","C:\\Users\\Filip\\Documents\\GitHub\\SDA_J19_Files\\src\\main\\resources\\text.txt");
    }
}
