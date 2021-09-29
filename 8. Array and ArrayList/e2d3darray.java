class e2d3darray {
    public static void main(String args[]){

        //two dimensional array
        int[][] twoD_array = new int[5][10]; // 5 rows and 10 cols
        // adding values to array
        for( int r = 0; r<twoD_array.length; r++){
            for(int c = 0; c<twoD_array[r].length; c++){
                twoD_array[r][c] = c + 1;
            }
        }

        //printing array
        for( int r = 0; r<twoD_array.length; r++){
            for(int c = 0; c<twoD_array[r].length; c++){
                System.out.printf("%d  ", twoD_array[r][c]);
            }
            System.out.println();
        }

        System.out.println();
        //three dimensional array 
        int[][][] threeD_array = new int [5][5][5]; //[X][Y][Z]
        //adding values to array
        for (int a = 0; a < threeD_array.length; a++){
            for (int b = 0; b < threeD_array[a].length; b++){
                for (int z = 0; z < threeD_array[a][b].length; z++){
                    threeD_array[a][b][z] = z + 1;
                }
            }
        }

        //printing array
        for (int a = 0; a < threeD_array.length; a++){
            for (int b = 0; b < threeD_array[a].length; b++){
                for (int z = 0; z < threeD_array[a][b].length; z++){
                    System.out.printf("%d  ", threeD_array[a][b][z]);
                }
            }System.out.println("Next z dim");
        }
    }
}
