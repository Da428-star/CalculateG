public class calculateG {
    public static class CalculateG {

        public static double square(double x) {
            return x * x;
        }

        public static void printResult(String message, String string) {
            System.out.println(message + string);
        }

        public static void main(String[] args) {
            double gravity = -9.81; // Earth's gravity in m/s^2
            double fallingTime = 30;
            double initialVelocity = 0.0;
            double finalVelocity = gravity * fallingTime + initialVelocity;
            double initialPosition = 0.0;
            double finalPosition = 0.5 * gravity * square(fallingTime) + initialVelocity * fallingTime + initialPosition;

            printResult("The object's position after " + fallingTime + " seconds is ", finalPosition + " m.");
            printResult("The object's velocity after " + fallingTime + " seconds is ", finalVelocity + " m/s.");
        }
    }}
