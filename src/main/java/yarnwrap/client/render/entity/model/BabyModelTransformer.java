package yarnwrap.client.render.entity.model;
public class BabyModelTransformer { public net.minecraft.client.render.entity.model.BabyModelTransformer wrapperContained; public BabyModelTransformer(net.minecraft.client.render.entity.model.BabyModelTransformer wrapperContained) { this.wrapperContained = wrapperContained; }

public BabyModelTransformer(java.util.Set headParts) { this.wrapperContained = new net.minecraft.client.render.entity.model.BabyModelTransformer(headParts); }
public BabyModelTransformer(boolean scaleHead,float babyYHeadOffset,float babyZHeadOffset,java.util.Set headParts) { this.wrapperContained = new net.minecraft.client.render.entity.model.BabyModelTransformer(scaleHead,babyYHeadOffset,babyZHeadOffset,headParts); }

}