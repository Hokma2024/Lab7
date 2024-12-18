package MVC;

import java.util.List;

public class ConsoleAchievementView implements AchievementView
{

    @Override
    public void displayAchievements(List<Achievement> achievements)
    {
        System.out.println("Список достижений:");
        for (Achievement achievement : achievements)
        {
            if (achievement.isUnlocked())
            {
                System.out.println("- " + achievement.getName() + " (разблокировано)");
            }
            else
            {
                System.out.println("- " + achievement.getName() + " (заблокировано)");
            }
        }
        System.out.println();
    }
}
