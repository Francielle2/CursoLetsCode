package ProjetoFlightsInformation;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class FlightsInformation {
    static IFilesManager filesManager = new FilesManagerJavaNio();

    public static void main(String[] args) {
        String dirIN = "files/in";
        String dirOUT = "files/out";
        String fileCSVPathIN = dirIN + "/flights.csv";
        String fligthsNewPath = dirOUT + "/fligthsNew.csv";

        if (!new File(dirIN).isDirectory()){
            filesManager.mkDir(dirIN);
        }
        if (!new File(dirOUT).isDirectory()){
            filesManager.mkDir(dirOUT);
        }
        List<Fly> fligthsInformation = new ArrayList<>();
        for (String[] flightLine : readFlyFile(fileCSVPathIN)) {
            fligthsInformation.add(new Fly(
                    flightLine[0], // origin
                    flightLine[1], // destination
                    flightLine[2], // airline
                    flightLine[3], // departure
                    flightLine[4], // arrival
                    flightLine[5]) // price
            );
        }
        writeFligthsNew(fligthsInformation, fligthsNewPath);
    }
    public static List<String[]> readFlyFile(String fileCSVPathIN){
        List<String> fileLines;

        if (!new File(fileCSVPathIN).exists()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o caminho do arquivo csv:");
    
            fileLines = filesManager.readLines(scanner.next().replace('\\', '/'));
            filesManager.writeLines(fileCSVPathIN,fileLines,false);
        } else {
            fileLines = filesManager.readLines(fileCSVPathIN);
        }
        return fileLines.stream()
                .skip(1)
                .map(line -> line.split(";"))
                .collect(Collectors.toList());
    }
    public static void writeFligthsNew(List<Fly> fligthsInformation, String fligthsNewPath){
        List<String> flightsInformationList = new ArrayList<>();
        
        flightsInformationList.add("origin;destination;airline;departure;arrival;price;time");
        for (Fly fly : fligthsInformation) {
            flightsInformationList.add(Fly.getLineCSV(fly));
        }
        filesManager.writeLines(fligthsNewPath,flightsInformationList,false);
    }
}