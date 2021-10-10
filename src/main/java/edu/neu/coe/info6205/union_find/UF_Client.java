package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class UF_Client {

    public static int count(int n) {
        Random rand = new Random();
        int connection_count = 0;
        UF_HWQUPC uf_hwqupc = new UF_HWQUPC(n, true);

        while (uf_hwqupc.components() != 1) {
            int i = rand.nextInt(n);

            int j = rand.nextInt(n);

            if(!uf_hwqupc.connected(i, j)) {
                uf_hwqupc.union(i, j);
            }
            connection_count++;
        }
        return connection_count;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        for(int i=0; i<20;i++) {

            int n = rand.nextInt(10000, 200000);
            System.out.println("Number of Objects: " + n + "  && Number of Pairs: " + count(n));
        }
    }
}
