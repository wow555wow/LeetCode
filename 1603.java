class ParkingSystem {
    
    int max[] = new int[3];
    int park[] = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        max[0] = big;
        max[1] = medium;
        max[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(park[carType-1]<max[carType-1]) {
            park[carType-1]++;
            return true;
        }
        else return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
