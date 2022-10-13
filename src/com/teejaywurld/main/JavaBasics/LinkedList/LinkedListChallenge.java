package com.teejaywurld.main.JavaBasics.LinkedList;

//  Create a program that implements a playlist for songs;
//  Create a Song Class having Title and Duration for a song;
//  The program will have an Album class containing a list of songs;
//  The albums will be stored in an Arraylist;
//  Songs from different albums can be added to the playlist and will appear in the list in the order they are added;
//  Once the songs have been added to the playlist, create a menu of options to:-
//  Quit, Skip forward to the next song, Skip backwards to the previous song, Replay the current song;
//  list the songs in the playlist (so you can only play songs that you own);
//  As an optional extra, provide an option to remove the current song from the playlist (hint: "listIterator.remove()");.

import java.util.*;

public class LinkedListChallenge {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stumbling", "Deep Purple");
        album.addSong("Stumbling", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("All men are righteous", 4.31);
        album.addSong("Hold on", 3.26);
        album.addSong("Lady double dealer", 5.16);
        album.addSong("Holy man", 3.21);
        album.addSong("High ball shooter", 2.46);
        album.addSong("Soldier of fortune", 3.13);
        album.addSong("Will of the street", 6.13);
        albums.add(album);

        album = new Album("For Those About To Rock", "AC/DC");
        album.addSong("For Those About To Rock", 5.44);
        album.addSong("I put the finger on you", 3.44);
        album.addSong("Let's go", 3.45);
        album.addSong("Inject the venom", 2.44);
        album.addSong("Snowballed", 3.33);
        album.addSong("Righteous walk", 3.51);
        album.addSong("Shady business", 5.32);
        album.addSong("Knight of the long knives", 3.14);
        album.addSong("Street motivation", 3.14);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("High ball shooter", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList); // does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(16, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing, " + listIterator.next().toString());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                        } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                            if (listIterator.hasNext()){
                                System.out.println("Now replaying " + listIterator.next().toString());
                                forward = true;
                            } else {
                                System.out.println("We have reached the end of the list");
                            }
                        }
                    break;

                case 4:
                     printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===========================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===========================");
    }

    private static void printMenu() {
        System.out.println("Available actions\nPress");
        System.out.println("""
                0 - to quit
                1 - to play next song
                2 - to play previous song
                3 - to replay the current song
                4 - list songs in the playlist
                5 - print available actions
                6 - to delete current song from playlist
                """);
    }
}
