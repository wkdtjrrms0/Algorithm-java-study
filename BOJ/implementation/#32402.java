import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Info: BOJ#32402 TPS
 * Ref: https://www.acmicpc.net/problem/32402
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Human human = new Human(0, 0);
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            switch (command) {
                case "W": human.W(); break;
                case "A": human.A(); break;
                case "S": human.S(); break;
                case "D": human.D(); break;
                case "MR": human.MR(); break;
                case "ML": human.ML(); break;
            }
            System.out.printf("%d %d %d %d%n"
                , human.getX(), human.getY(), human.getCameraX(), human.getCameraY());
        }
    }

    static class Human {
        String direction;
        int x;
        int y;

        Human(int x, int y) {
            this.direction = "W";
            this.x = x; this.y = y;
        }
        int getX() { return this.x; }
        int getY() { return this.y; }
        int getCameraX() {
            int cameraX = 0;
            switch (this.direction) {
                case "W": cameraX = this.x; break;
                case "A": cameraX = this.x + 1; break;
                case "S": cameraX = this.x; break;
                case "D": cameraX = this.x - 1; break;
            }
            return cameraX;
        }
        int getCameraY() {
            int cameraY = 0;
            switch (this.direction) {
                case "W": cameraY = this.y - 1; break;
                case "A": cameraY = this.y; break;
                case "S": cameraY = this.y + 1; break;
                case "D": cameraY = this.y; break;
            }
            return cameraY;
        }

        void W() {
            switch (this.direction) {
                case "W": this.y++; break;
                case "A": this.x--; break;
                case "S": this.y--; break;
                case "D": this.x++; break;
            }
        }
        void A() {
            switch (this.direction) {
                case "W": this.x--; break;
                case "A": this.y--; break;
                case "S": this.x++; break;
                case "D": this.y++; break;
            }
        }
        void S() {
            switch (this.direction) {
                case "W": this.y--; break;
                case "A": this.x++; break;
                case "S": this.y++; break;
                case "D": this.x--; break;
            }
        }
        void D() {
            switch (this.direction) {
                case "W": this.x++; break;
                case "A": this.y++; break;
                case "S": this.x--; break;
                case "D": this.y--; break;
            }
        }
        void MR() {
            switch (this.direction) {
                case "W": this.direction = "D"; break;
                case "A": this.direction = "W"; break;
                case "S": this.direction = "A"; break;
                case "D": this.direction = "S"; break;
            }
        }
        void ML() {
            switch (this.direction) {
                case "W": this.direction = "A"; break;
                case "A": this.direction = "S"; break;
                case "S": this.direction = "D"; break;
                case "D": this.direction = "W"; break;
            }
        }
    }
}
