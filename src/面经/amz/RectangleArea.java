package 面经.amz;



/**
 * Created by yuboyang on 2/20/17.
 */


/*
get whether overlap of 2 rectangle
and the area of 2 rectangleC



 */

// todo case, 注意 >= 0 , 挨着就算overlap

public class RectangleArea {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        long ox = (long)Math.min(C, G) - (long)Math.max(A, E);
        if (ox < 0) ox = 0;
        long oy = (long)Math.min(D, H) - (long)Math.max(B, F);
        if (oy < 0) oy = 0;

        return (int) ((C - A) * (D - B) + (G - E) * (H - F) - ox * oy);
    }

    public boolean overlap(int A, int B, int C, int D, int E, int F, int G, int H) {
        int ox = Math.min(C, G) - Math.max(A, E); // overlap x
        int oy = Math.min(D, H) - Math.max(B, F); // overlap y
        return ox >= 0 && oy >= 0; //
    }
}
