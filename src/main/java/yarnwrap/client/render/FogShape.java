package yarnwrap.client.render;
public class FogShape { public net.minecraft.client.render.FogShape wrapperContained; public FogShape(net.minecraft.client.render.FogShape wrapperContained) { this.wrapperContained = wrapperContained; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// // public FogShape(java.lang.String id) { this.wrapperContained = new net.minecraft.client.render.FogShape(id); }
public int getId() { return wrapperContained.getId(); }

}