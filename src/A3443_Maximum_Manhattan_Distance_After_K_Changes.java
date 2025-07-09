public class A3443_Maximum_Manhattan_Distance_After_K_Changes {
    public static void main(String[] args) {

    }
    public static int maxDistance(String s, int k) {
        int x = 0,y = 0;
        int maxDistance = 0;
        int i = 0;
        for (char direction : s.toCharArray()){
            switch (direction) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'W' -> x--;
            }
            maxDistance = Math.max(maxDistance,Math.min(Math.abs(x) + Math.abs(y) + k * 2,i+1));
            i++;
        }
        return maxDistance;
    }
}
