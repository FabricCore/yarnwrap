package yarnwrap.village;
public class VillagerDataContainer { public net.minecraft.village.VillagerDataContainer wrapperContained; public VillagerDataContainer(net.minecraft.village.VillagerDataContainer wrapperContained) { this.wrapperContained = wrapperContained; }

public void setVillagerData(yarnwrap.village.VillagerData villagerData) { wrapperContained.setVillagerData(villagerData.wrapperContained); }
public yarnwrap.village.VillagerData getVillagerData() { return new yarnwrap.village.VillagerData(wrapperContained.getVillagerData()); }

}