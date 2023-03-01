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

public class SupernaturalStrengthItem extends Item {
    public SupernaturalStrengthItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("You feel great power emanating from this...").formatted(Formatting.GRAY));

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == Hand.MAIN_HAND) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2400, 4));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20, 5));
            user.getItemCooldownManager().set(this, 20);
            user.getStackInHand(Hand.MAIN_HAND).setCount(user.getStackInHand(Hand.MAIN_HAND).getCount()-1);
        }

        if (world.isClient() && hand == Hand.MAIN_HAND) {
            //BLOCK_AMETHYST_CLUSTER_BREAK
            user.playSound(SoundEvents.ITEM_TRIDENT_THUNDER, 2f, 1f);
            user.sendMessage(Text.literal("You feel a great surge of strength!").formatted(Formatting.RED), true);
        }

        return super.use(world, user, hand);
    }


}
