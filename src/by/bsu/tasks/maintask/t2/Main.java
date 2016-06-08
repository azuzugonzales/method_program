package by.bsu.tasks.maintask.t2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Strim = new BufferedReader(new FileReader("C:\\Users\\pasobionic\\Dropbox\\workspace\\method_program\\src\\by\\bsu\\tasks\\maintask\\t2\\data.txt"));
        //c:\Users\pasobionic\Dropbox\workspace\method_program\src\by\bsu\tasks\maintask\t2\

        String line = Strim.readLine();
        int source = Integer.parseInt(line);

        for (int testIndex = 0; testIndex < source; testIndex++) {
            String[] citiesIds = new String[10000];
            line = Strim.readLine();
            int CountCities = Integer.parseInt(line);
            int matrixSize = CountCities + 1;
            Matrix g = new Matrix(matrixSize);

            for (int CityIndex = 0; CityIndex < CountCities; CityIndex++) {
                line = Strim.readLine();
                String CityName = line;
                citiesIds[CityIndex] = CityName;
                line = Strim.readLine();
                int p = Integer.parseInt(line);

                for (int neighborIndex = 0; neighborIndex < p; neighborIndex++) {
                    line = Strim.readLine();
                    String[] brokenLine = line.split(" ");
                    int cityToConnect = Integer.parseInt(brokenLine[0]);
                    int weightOfConnection = Integer.parseInt(brokenLine[1]);
                    g.setEdge(CityIndex, cityToConnect, weightOfConnection);
                }
            }

            line = Strim.readLine();
            int routesToFind = Integer.parseInt(line);
            for (int routesIndex = 0; routesIndex < routesToFind; routesIndex++) {
                line = Strim.readLine();
                String[] cityNames = line.split(" ");
                String start = cityNames[0];
                String destination = cityNames[1];
                List<String> list = new ArrayList<String>();
                for (String s : citiesIds) {
                    if (s != null) {
                        list.add(s);
                    }
                }

                citiesIds = list.toArray(new String[list.size()]);
                int startIndex = 0;
                int destinationIndex = 0;

                for (int i = 0; i < citiesIds.length; i++) {
                    if (start.equals(citiesIds[i])) {
                        startIndex = i;
                        break;
                    }
                }

                for (int i = 0; i < citiesIds.length; i++) {
                    if (destination.equals(citiesIds[i])) {
                        destinationIndex = i;
                        break;
                    }
                }

                Integer[] distancesFromSource = g.distancesFrom(startIndex);
                int destinationDistance = distancesFromSource[destinationIndex];
                System.out.println(destinationDistance);
            }
        }
        Strim.close();
    }
}