package org.netbeans.rest.application.config;

import com.mycompany.rest.ReadIdResource;
import com.mycompany.rest.ListAllResource;
import com.mycompany.rest.PostVoteResource;
import com.mycompany.rest.UpdateRatingResource;
import com.mycompany.rest.ResetVotesResource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(ReadIdResource.class);
        set.add(ListAllResource.class);
        set.add(PostVoteResource.class);
        set.add(UpdateRatingResource.class);
        set.add(ResetVotesResource.class);
        return set;
    }
}
