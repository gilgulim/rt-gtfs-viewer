package com.rtgtfsviewer;

import com.google.transit.realtime.GtfsRealtime.FeedMessage;
import java.io.File;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) throws Exception{
        if(args.length == 0){
            System.out.println("*** you need to pass the file path to the args parameter");
            System.exit(1);
        }

        File file = new File(args[0]);
        FeedMessage feed = FeedMessage.parseFrom(new FileInputStream(file));
        System.out.println(feed);
    }
}
