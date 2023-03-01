package net.braxtenchenay.voidalchemy.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GlimmerOfHopeItem extends Item {
    public GlimmerOfHopeItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("You feel an enlightening energy within...").formatted(Formatting.GRAY));

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == Hand.MAIN_HAND) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 4800, 2));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2400, 2));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 2400, 0));
            user.getItemCooldownManager().set(this, 20);
            user.getStackInHand(Hand.MAIN_HAND).setCount(user.getStackInHand(Hand.MAIN_HAND).getCount()-1);
        }

        if (world.isClient() && hand == Hand.MAIN_HAND) {
            user.playSound(SoundEvents.BLOCK_AMETHYST_CLUSTER_BREAK, 2f, 1f);
            user.sendMessage(Text.literal("Your spirits are lifted!").formatted(Formatting.YELLOW), true);
        }

        return super.use(world, user, hand);
    }


}
