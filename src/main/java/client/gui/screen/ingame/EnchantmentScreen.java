package yarnwrap.client.gui.screen.ingame;
public class EnchantmentScreen { public net.minecraft.client.gui.screen.ingame.EnchantmentScreen wrapperContained; public EnchantmentScreen(net.minecraft.client.gui.screen.ingame.EnchantmentScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier BOOK_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BOOK_TEXTURE); }
public float pageTurningSpeed() { return wrapperContained.pageTurningSpeed; }
public float nextPageTurningSpeed() { return wrapperContained.nextPageTurningSpeed; }
public float pageRotationSpeed() { return wrapperContained.pageRotationSpeed; }
// public yarnwrap.client.render.entity.model.BookModel BOOK_MODEL() { return new yarnwrap.client.render.entity.model.BookModel(wrapperContained.BOOK_MODEL); }
public float approximatePageAngle() { return wrapperContained.approximatePageAngle; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
public float nextPageAngle() { return wrapperContained.nextPageAngle; }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
public float pageAngle() { return wrapperContained.pageAngle; }
public int ticks() { return wrapperContained.ticks; }
// public net.minecraft.util.Identifier[] LEVEL_TEXTURES() { return wrapperContained.LEVEL_TEXTURES; }
// public net.minecraft.util.Identifier[] LEVEL_DISABLED_TEXTURES() { return wrapperContained.LEVEL_DISABLED_TEXTURES; }
// public yarnwrap.util.Identifier ENCHANTMENT_SLOT_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ENCHANTMENT_SLOT_DISABLED_TEXTURE); }
// public yarnwrap.util.Identifier ENCHANTMENT_SLOT_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ENCHANTMENT_SLOT_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier ENCHANTMENT_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ENCHANTMENT_SLOT_TEXTURE); }
public void doTick() { wrapperContained.doTick(); }
// public void drawBook(yarnwrap.client.gui.DrawContext context,int x,int y,float delta) { wrapperContained.drawBook(context.wrapperContained,x,y,delta); }

}