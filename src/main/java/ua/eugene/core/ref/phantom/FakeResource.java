package ua.eugene.core.ref.phantom;

/**
 * @author Evgenij Pismennyj
 *         created on 2015-10-22.
 */
public class FakeResource implements AutoCloseable {

    private final int resourceId;

    public FakeResource(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getResourceId() {
        return resourceId;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource with id = " + resourceId + " released");
    }
}
