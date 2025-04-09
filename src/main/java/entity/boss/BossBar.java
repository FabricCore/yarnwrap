package yarnwrap.entity.boss;
public class BossBar { public net.minecraft.entity.boss.BossBar wrapperContained; public BossBar(net.minecraft.entity.boss.BossBar wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public boolean thickenFog() { return wrapperContained.thickenFog; }
// public float percent() { return wrapperContained.percent; }
// public boolean dragonMusic() { return wrapperContained.dragonMusic; }
// public boolean darkenSky() { return wrapperContained.darkenSky; }
// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public Object color() { return wrapperContained.color; }
// public Object style() { return wrapperContained.style; }
public yarnwrap.entity.boss.BossBar setDarkenSky(boolean darkenSky) { return new yarnwrap.entity.boss.BossBar(wrapperContained.setDarkenSky(darkenSky)); }
public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
public void setPercent(float percent) { wrapperContained.setPercent(percent); }
// public void setStyle(Object style) { wrapperContained.setStyle(style); }
public yarnwrap.entity.boss.BossBar setDragonMusic(boolean dragonMusic) { return new yarnwrap.entity.boss.BossBar(wrapperContained.setDragonMusic(dragonMusic)); }
public yarnwrap.entity.boss.BossBar setThickenFog(boolean thickenFog) { return new yarnwrap.entity.boss.BossBar(wrapperContained.setThickenFog(thickenFog)); }
public float getPercent() { return wrapperContained.getPercent(); }
public void setName(yarnwrap.text.Text name) { wrapperContained.setName(name.wrapperContained); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
public Object getStyle() { return wrapperContained.getStyle(); }
// public void setColor(Object color) { wrapperContained.setColor(color); }
public boolean shouldDarkenSky() { return wrapperContained.shouldDarkenSky(); }
public boolean hasDragonMusic() { return wrapperContained.hasDragonMusic(); }
public boolean shouldThickenFog() { return wrapperContained.shouldThickenFog(); }
public Object getColor() { return wrapperContained.getColor(); }

}