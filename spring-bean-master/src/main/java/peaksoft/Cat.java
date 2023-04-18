package peaksoft;

import org.springframework.context.annotation.Scope;
@Scope("prototype")
public class Cat {
   private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
