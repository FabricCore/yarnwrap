package yarnwrap.entity.ai.brain.task;
public class CelebrateRaidWinTask { public net.minecraft.entity.ai.brain.task.CelebrateRaidWinTask wrapperContained; public CelebrateRaidWinTask(net.minecraft.entity.ai.brain.task.CelebrateRaidWinTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.raid.Raid raid() { return new yarnwrap.village.raid.Raid(wrapperContained.raid); }
// public void raid(yarnwrap.village.raid.Raid value) { wrapperContained.raid = value.wrapperContained; }
public CelebrateRaidWinTask(int minRunTime,int maxRunTime) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.CelebrateRaidWinTask(minRunTime,maxRunTime); }
// public yarnwrap.item.ItemStack createFirework(yarnwrap.util.DyeColor color,int flight) { return new yarnwrap.item.ItemStack(wrapperContained.createFirework(color.wrapperContained,flight)); }

}