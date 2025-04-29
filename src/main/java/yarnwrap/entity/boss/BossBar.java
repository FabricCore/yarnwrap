package yarnwrap.entity.boss;
public class BossBar { public net.minecraft.entity.boss.BossBar wrapperContained; public BossBar(net.minecraft.entity.boss.BossBar wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public void uuid(java.util.UUID value) { wrapperContained.uuid = value; }
// public static java.util.UUID uuid() { return net.minecraft.entity.boss.BossBar.uuid; }
// public static void uuid(java.util.UUID value, ) { net.minecraft.entity.boss.BossBar.uuid = value; }

// public boolean thickenFog() { return wrapperContained.thickenFog; }
// public void thickenFog(boolean value) { wrapperContained.thickenFog = value; }
// public static boolean thickenFog() { return net.minecraft.entity.boss.BossBar.thickenFog; }
// public static void thickenFog(boolean value, ) { net.minecraft.entity.boss.BossBar.thickenFog = value; }

// public float percent() { return wrapperContained.percent; }
// public void percent(float value) { wrapperContained.percent = value; }
// public static float percent() { return net.minecraft.entity.boss.BossBar.percent; }
// public static void percent(float value, ) { net.minecraft.entity.boss.BossBar.percent = value; }

// public boolean dragonMusic() { return wrapperContained.dragonMusic; }
// public void dragonMusic(boolean value) { wrapperContained.dragonMusic = value; }
// public static boolean dragonMusic() { return net.minecraft.entity.boss.BossBar.dragonMusic; }
// public static void dragonMusic(boolean value, ) { net.minecraft.entity.boss.BossBar.dragonMusic = value; }

// public boolean darkenSky() { return wrapperContained.darkenSky; }
// public void darkenSky(boolean value) { wrapperContained.darkenSky = value; }
// public static boolean darkenSky() { return net.minecraft.entity.boss.BossBar.darkenSky; }
// public static void darkenSky(boolean value, ) { net.minecraft.entity.boss.BossBar.darkenSky = value; }

// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.text.Text name() { return new yarnwrap.text.Text(net.minecraft.entity.boss.BossBar.name); }
// public static void name(yarnwrap.text.Text value, ) { net.minecraft.entity.boss.BossBar.name = value.wrapperContained; }

// public Object color() { return wrapperContained.color; }
// // public void color(Object value) { wrapperContained.color = value; }
// // public static Object color() { return net.minecraft.entity.boss.BossBar.color; }
// // public static void color(Object value, ) { net.minecraft.entity.boss.BossBar.color = value; }

// public Object style() { return wrapperContained.style; }
// // public void style(Object value) { wrapperContained.style = value; }
// // public static Object style() { return net.minecraft.entity.boss.BossBar.style; }
// // public static void style(Object value, ) { net.minecraft.entity.boss.BossBar.style = value; }

// public BossBar(java.util.UUID uuid,yarnwrap.text.Text name,Object color,Object style) { this.wrapperContained = new net.minecraft.entity.boss.BossBar(uuid,name.wrapperContained,color,style); }
public yarnwrap.entity.boss.BossBar setDarkenSky(boolean darkenSky) { return new yarnwrap.entity.boss.BossBar(wrapperContained.setDarkenSky(darkenSky)); }
// public static yarnwrap.entity.boss.BossBar setDarkenSky(boolean darkenSky, ) { return new yarnwrap.entity.boss.BossBar(net.minecraft.entity.boss.BossBar.setDarkenSky(darkenSky)); }
public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
// public static java.util.UUID getUuid() { return net.minecraft.entity.boss.BossBar.getUuid(); }
public void setPercent(float percent) { wrapperContained.setPercent(percent); }
// public static void setPercent(float percent, ) { net.minecraft.entity.boss.BossBar.setPercent(percent); }
// public void setStyle(Object style) { wrapperContained.setStyle(style); }
// public static void setStyle(Object style, ) { net.minecraft.entity.boss.BossBar.setStyle(style); }
public yarnwrap.entity.boss.BossBar setDragonMusic(boolean dragonMusic) { return new yarnwrap.entity.boss.BossBar(wrapperContained.setDragonMusic(dragonMusic)); }
// public static yarnwrap.entity.boss.BossBar setDragonMusic(boolean dragonMusic, ) { return new yarnwrap.entity.boss.BossBar(net.minecraft.entity.boss.BossBar.setDragonMusic(dragonMusic)); }
public yarnwrap.entity.boss.BossBar setThickenFog(boolean thickenFog) { return new yarnwrap.entity.boss.BossBar(wrapperContained.setThickenFog(thickenFog)); }
// public static yarnwrap.entity.boss.BossBar setThickenFog(boolean thickenFog, ) { return new yarnwrap.entity.boss.BossBar(net.minecraft.entity.boss.BossBar.setThickenFog(thickenFog)); }
public float getPercent() { return wrapperContained.getPercent(); }
// public static float getPercent() { return net.minecraft.entity.boss.BossBar.getPercent(); }
public void setName(yarnwrap.text.Text name) { wrapperContained.setName(name.wrapperContained); }
// public static void setName(yarnwrap.text.Text name, ) { net.minecraft.entity.boss.BossBar.setName(name.wrapperContained); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.entity.boss.BossBar.getName()); }
public Object getStyle() { return wrapperContained.getStyle(); }
// public static Object getStyle() { return net.minecraft.entity.boss.BossBar.getStyle(); }
// public void setColor(Object color) { wrapperContained.setColor(color); }
// public static void setColor(Object color, ) { net.minecraft.entity.boss.BossBar.setColor(color); }
public boolean shouldDarkenSky() { return wrapperContained.shouldDarkenSky(); }
// public static boolean shouldDarkenSky() { return net.minecraft.entity.boss.BossBar.shouldDarkenSky(); }
public boolean hasDragonMusic() { return wrapperContained.hasDragonMusic(); }
// public static boolean hasDragonMusic() { return net.minecraft.entity.boss.BossBar.hasDragonMusic(); }
public boolean shouldThickenFog() { return wrapperContained.shouldThickenFog(); }
// public static boolean shouldThickenFog() { return net.minecraft.entity.boss.BossBar.shouldThickenFog(); }
public Object getColor() { return wrapperContained.getColor(); }
// public static Object getColor() { return net.minecraft.entity.boss.BossBar.getColor(); }

}