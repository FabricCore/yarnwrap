package yarnwrap.client.render.entity.model;
public class TintableAnimalModel { public net.minecraft.client.render.entity.model.TintableAnimalModel wrapperContained; public TintableAnimalModel(net.minecraft.client.render.entity.model.TintableAnimalModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tint() { return wrapperContained.tint; }
// public void tint(int value) { wrapperContained.tint = value; }
// public static int tint() { return net.minecraft.client.render.entity.model.TintableAnimalModel.tint; }
// public static void tint(int value, ) { net.minecraft.client.render.entity.model.TintableAnimalModel.tint = value; }

public void setColorMultiplier(int tint) { wrapperContained.setColorMultiplier(tint); }
// public static void setColorMultiplier(int tint, ) { net.minecraft.client.render.entity.model.TintableAnimalModel.setColorMultiplier(tint); }

}