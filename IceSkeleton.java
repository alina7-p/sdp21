package abstractfactory;

public class IceSkeleton implements Enemy {
    @Override
    public void attack() {
        System.out.println("Ice Skeleton shoots a freezing frost arrow!");
    }
}