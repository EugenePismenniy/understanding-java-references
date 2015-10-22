package ua.eugene.core.ref.phantom;

/**
 * @author Evgenij Pismennyj
 *         created on 2015-10-22.
 */
public class ResourceLoader {

    private FakeResource resource = null;

    private final int resourceId;

    public ResourceLoader(int resourceId) {
        this.resourceId = resourceId;
    }

    public FakeResource getResource() {

        if (resource == null)
            resource = new FakeResource(resourceId);

        return resource;
    }
}
