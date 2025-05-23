package yarnwrap.client.render.entity.state;
public class VillagerEntityRenderState { public net.minecraft.client.render.entity.state.VillagerEntityRenderState wrapperContained; public VillagerEntityRenderState(net.minecraft.client.render.entity.state.VillagerEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean headRolling() { return wrapperContained.headRolling; }
public void headRolling(boolean value) { wrapperContained.headRolling = value; }
// public static boolean headRolling() { return net.minecraft.client.render.entity.state.VillagerEntityRenderState.headRolling; }
// public static void headRolling(boolean value, ) { net.minecraft.client.render.entity.state.VillagerEntityRenderState.headRolling = value; }

public yarnwrap.village.VillagerData villagerData() { return new yarnwrap.village.VillagerData(wrapperContained.villagerData); }
public void villagerData(yarnwrap.village.VillagerData value) { wrapperContained.villagerData = value.wrapperContained; }
// public static yarnwrap.village.VillagerData villagerData() { return new yarnwrap.village.VillagerData(net.minecraft.client.render.entity.state.VillagerEntityRenderState.villagerData); }
// public static void villagerData(yarnwrap.village.VillagerData value, ) { net.minecraft.client.render.entity.state.VillagerEntityRenderState.villagerData = value.wrapperContained; }


}