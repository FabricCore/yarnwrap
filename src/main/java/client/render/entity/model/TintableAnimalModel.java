package yarnwrap.client.render.entity.model;
public class TintableAnimalModel { public net.minecraft.client.render.entity.model.TintableAnimalModel wrapperContained; public TintableAnimalModel(net.minecraft.client.render.entity.model.TintableAnimalModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tint() { return wrapperContained.tint; }
public void setColorMultiplier(int tint) { wrapperContained.setColorMultiplier(tint); }

}