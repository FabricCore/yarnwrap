package yarnwrap.stat;
public class StatHandler { public net.minecraft.stat.StatHandler wrapperContained; public StatHandler(net.minecraft.stat.StatHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap statMap() { return wrapperContained.statMap; }
// public void statMap(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.statMap = value; }
public void increaseStat(yarnwrap.entity.player.PlayerEntity player,yarnwrap.stat.Stat stat,int value) { wrapperContained.increaseStat(player.wrapperContained,stat.wrapperContained,value); }
public void setStat(yarnwrap.entity.player.PlayerEntity player,yarnwrap.stat.Stat stat,int value) { wrapperContained.setStat(player.wrapperContained,stat.wrapperContained,value); }
public int getStat(yarnwrap.stat.StatType type,java.lang.Object stat) { return wrapperContained.getStat(type.wrapperContained,stat); }
public int getStat(yarnwrap.stat.Stat stat) { return wrapperContained.getStat(stat.wrapperContained); }

}