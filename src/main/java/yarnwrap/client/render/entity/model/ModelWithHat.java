package yarnwrap.client.render.entity.model;
public class ModelWithHat { public net.minecraft.client.render.entity.model.ModelWithHat wrapperContained; public ModelWithHat(net.minecraft.client.render.entity.model.ModelWithHat wrapperContained) { this.wrapperContained = wrapperContained; }

public void setHatVisible(boolean visible) { wrapperContained.setHatVisible(visible); }
// public static void setHatVisible(boolean visible, ) { net.minecraft.client.render.entity.model.ModelWithHat.setHatVisible(visible); }

}