package yarnwrap.client.gui.screen.ingame;
public class AbstractInventoryScreen { public net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen wrapperContained; public AbstractInventoryScreen(net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier EFFECT_BACKGROUND_LARGE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EFFECT_BACKGROUND_LARGE_TEXTURE); }
// public void EFFECT_BACKGROUND_LARGE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EFFECT_BACKGROUND_LARGE_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier EFFECT_BACKGROUND_SMALL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EFFECT_BACKGROUND_SMALL_TEXTURE); }
// public void EFFECT_BACKGROUND_SMALL_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EFFECT_BACKGROUND_SMALL_TEXTURE = value.wrapperContained; }
// public void drawStatusEffectBackgrounds(yarnwrap.client.gui.DrawContext context,int x,int height,java.lang.Iterable statusEffects,boolean wide) { wrapperContained.drawStatusEffectBackgrounds(context.wrapperContained,x,height,statusEffects,wide); }
// public void drawStatusEffectSprites(yarnwrap.client.gui.DrawContext context,int x,int height,java.lang.Iterable statusEffects,boolean wide) { wrapperContained.drawStatusEffectSprites(context.wrapperContained,x,height,statusEffects,wide); }
// public void drawStatusEffectDescriptions(yarnwrap.client.gui.DrawContext context,int x,int height,java.lang.Iterable statusEffects) { wrapperContained.drawStatusEffectDescriptions(context.wrapperContained,x,height,statusEffects); }
// public void drawStatusEffects(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY) { wrapperContained.drawStatusEffects(context.wrapperContained,mouseX,mouseY); }
// public yarnwrap.text.Text getStatusEffectDescription(yarnwrap.entity.effect.StatusEffectInstance statusEffect) { return new yarnwrap.text.Text(wrapperContained.getStatusEffectDescription(statusEffect.wrapperContained)); }
public boolean hideStatusEffectHud() { return wrapperContained.hideStatusEffectHud(); }

}