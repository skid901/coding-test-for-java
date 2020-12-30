package kr.co.programmers;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;

public class Hash004 {

    private static class Song implements Comparable<Song> {

        private final int id;
        private final String genre;
        private final int plays;

        public Song(int id, String genre, int plays) {
            this.id = id;
            this.genre = genre;
            this.plays = plays;
        }

        public int getId() {
            return this.id;
        }

        public String getGenre() {
            return this.genre;
        }

        public int getPlays() {
            return this.plays;
        }

        @Override
        public int compareTo(Song o) {
            return o.plays - this.plays;
        }
    }

    private static int sumPlays(List<Song> songs) {
        return songs.stream()
                .mapToInt(Song::getPlays)
                .sum();
    }

    public static int[] solve(String[] genres, int[] plays) {
        return IntStream.range(0, genres.length)
                .mapToObj(id -> new Song(id, genres[id], plays[id]))
                .collect(groupingBy(Song::getGenre))
                .values().stream()
                .sorted((a, b) -> sumPlays(b) - sumPlays(a))
                .flatMapToInt(songs -> songs.stream()
                        .sorted(Song::compareTo)
                        .limit(2)
                        .mapToInt(Song::getId))
                .toArray();
    }
}
