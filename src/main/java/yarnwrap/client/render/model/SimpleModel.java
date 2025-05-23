package yarnwrap.client.render.model;
public class SimpleModel { public net.minecraft.client.render.model.SimpleModel wrapperContained; public SimpleModel(net.minecraft.client.render.model.SimpleModel wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String name() { return wrapperContained.name(); }
// public static java.lang.String name() { return net.minecraft.client.render.model.SimpleModel.name(); }

}