package MVC;

import java.util.List;

public class AchievementController
{
    private final List<Achievement> achievements;
    private final AchievementView view;

    public AchievementController(List<Achievement> achievements, AchievementView view)
    {
        this.achievements = achievements;
        this.view = view;
    }

    public void unlockAchievement(int index)
    {
        if (index < 0 || index >= achievements.size())
        {
            System.out.println("Ошибка: индекс достижения вне допустимого диапазона!");
            return;
        }

        Achievement achievement = achievements.get(index);
        if (!achievement.isUnlocked())
        {
            achievement.unlock();
            System.out.println("Достижение \"" + achievement.getName() + "\" успешно разблокировано!");
        }
        else
        {
            System.out.println("Достижение \"" + achievement.getName() + "\" уже разблокировано!");
        }

        updateView();
    }

    public void updateView()
    {
        view.displayAchievements(achievements);
    }
}
