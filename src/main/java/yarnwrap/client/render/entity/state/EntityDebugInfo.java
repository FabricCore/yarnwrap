package yarnwrap.client.render.entity.state;
public class EntityDebugInfo { public net.minecraft.client.render.entity.state.EntityDebugInfo wrapperContained; public EntityDebugInfo(net.minecraft.client.render.entity.state.EntityDebugInfo wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityDebugInfo(boolean missing) { this.wrapperContained = new net.minecraft.client.render.entity.state.EntityDebugInfo(missing); }

}