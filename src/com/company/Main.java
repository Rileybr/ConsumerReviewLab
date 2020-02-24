package com.company;

import java.awt.*;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        System.out.println(Review.totalSentiment("SimpleReview"));
        System.out.println(Review.starRating("SimpleReview") + " stars");
    }
}
