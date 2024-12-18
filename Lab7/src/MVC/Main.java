package MVC;
/*
Учёт игровых достижений:
Реализовать модель Achievement с полями name и isUnlocked. Вид должен показывать список достижений, а контроллер — разблокировать их.
*/
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Achievement> achievements = new ArrayList<>();
        achievements.add(new Achievement("Самый лучший"));
        achievements.add(new Achievement("Самый худший"));
        achievements.add(new Achievement("Первая кровь"));
        achievements.add(new Achievement("Конец?"));
        achievements.add(new Achievement("Невозможно"));

        AchievementView view = new ConsoleAchievementView();

        AchievementController controller = new AchievementController(achievements, view);

        controller.updateView();

        controller.unlockAchievement(2);
        controller.unlockAchievement(4);
        controller.unlockAchievement(10);
    }
}

