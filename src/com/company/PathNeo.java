package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Stream;

public class PathNeo {
    Path path = Paths.get("a.txt");
    List<String> lines = Files.readAllLines(path);

    public PathNeo() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get("scan.txt"), Paths.get("MyFile.txt"));
        Files.move(Paths.get("a.txt"), Paths.get("scan.txt"), StandardCopyOption.REPLACE_EXISTING);
        Path ps = Paths.get("MyFile.txt");
        Files.delete(ps);
try (Stream<Path> entries = Files.list(Paths.get(".")))
{
    entries.forEach(System.out::println);
}
    }
}
