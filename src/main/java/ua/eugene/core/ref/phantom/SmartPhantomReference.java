package ua.eugene.core.ref.phantom;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @author Evgenij Pismennyj
 *         created on 2015-10-22.
 */
public class SmartPhantomReference extends PhantomReference<ResourceLoader> {

    private FakeResource resource;

    public SmartPhantomReference(ResourceLoader referent, ReferenceQueue<? super ResourceLoader> queueRefs) {
        super(referent, queueRefs);
        this.resource = referent.getResource();
    }

    public void releaseResource() {
        try {
            resource.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
