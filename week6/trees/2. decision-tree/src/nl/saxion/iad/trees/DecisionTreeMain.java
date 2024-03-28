package nl.saxion.iad.trees;

import java.util.Scanner;

public class DecisionTreeMain {

    public void run(){
        IADTree root = new IADTree();
        IADNode car = new IADNode("Is the car color red?");
        root.setRoot(car);

        IADNode carRed = new IADNode("Is the model > 2010?");
        IADNode carYellow = new IADNode("Is the car yellow?");
        car.setRight(carYellow);
        car.setLeft(carRed);

        IADNode mileage = new IADNode("Is the mileage < 50000KM?");
        carRed.setRight(mileage);
        carRed.setLeft(new IADNode("Buy the car!"));

        IADNode model = new IADNode("Is the car a Ferrari?");
        carYellow.setRight(new IADNode("Don't buy the car!"));
        carYellow.setLeft(model);

        mileage.setRight(new IADNode("Buy the car!"));
        mileage.setLeft(new IADNode("Don't buy the car!"));

        model.setLeft(new IADNode("Buy the car!"));
        model.setRight(new IADNode("Don't buy the car!"));

        System.out.println("Should you buy this car?");

        IADNode currentNode = root.getRoot();
        Scanner scanner = new Scanner(System.in);

        while (!currentNode.isLeaf()) {
            System.out.println(currentNode.getValue());
            String answer = scanner.nextLine();
            if (answer.equals("yes")) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }

        System.out.println(currentNode.getValue());
    }




    public static void main(String[] args) {
        new DecisionTreeMain().run();
    }
}
