package goldDigger.models.discoverer;

import goldDigger.models.museum.Museum;

public class BaseDiscoverer implements Discoverer{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getEnergy() {
        return 0;
    }

    @Override
    public boolean canDig() {
        return false;
    }

    @Override
    public Museum getMuseum() {
        return null;
    }

    @Override
    public void dig() {

    }
}
