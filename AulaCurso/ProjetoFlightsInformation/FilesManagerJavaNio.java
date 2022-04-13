package ProjetoFlightsInformation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesManagerJavaNio implements IFilesManager {

    @Override
    public void delFile(String pathFile) {
        Path file = Path.of(pathFile);
        System.out.println("Excluindo o arquivo " + file + "...");
        try {
            Files.delete(file);
            System.out.println("Arquivo " + file + " excluido com sucesso!");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    @Override
    public void delDir(String pathDir) {
        Path dir = Path.of(pathDir);
        System.out.println("Excluindo diretorio " + dir + "...");
        try {
            Files.delete(dir);
            System.out.println("Diretorio " + dir + " excluindo com sucesso!");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    @Override
    public void mkFile(String pathFile) {
        Path file = Path.of(pathFile);
        System.out.println("Criando arquivo " + file + "...");
        try {
            Files.createFile(file);
            System.out.println("Arquivo " + file + " criado com sucesso!");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    @Override
    public void mkDir(String pathDir) {
        Path dir = Path.of(pathDir);
        System.out.println("Criando diretorio " + dir + "...");
        try {
            Files.createDirectories(dir);
            System.out.println("Diretorio " + dir + " criado com sucesso!");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    @Override
    public List<String> readLines(String pathFile) {
        Path file = Paths.get(pathFile);
        try {
            return Files.readAllLines(file);
        } catch (IOException ioException) {
            return null;
        }
    }

    @Override
    public void writeLines(String pathFile, List<String> fileLines,boolean append) {
        Path path = Paths.get(pathFile);
        try {
            if (append) {
                Files.write(path, fileLines, StandardOpenOption.APPEND);
            } else {
                Files.write(path, fileLines);
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}