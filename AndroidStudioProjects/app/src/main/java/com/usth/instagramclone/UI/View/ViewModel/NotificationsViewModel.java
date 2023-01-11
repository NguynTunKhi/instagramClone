package com.usth.instagramclone.UI.View.ViewModel;

import java.util.List;

@HiltViewModel
public class NotificationsViewModel extends ViewModel {
    private NotificationRepository nRepo;
    private MutableLiveData<List<Notification>> notifications;
    private MutableLiveData<Integer> unseenNotificationCount;

    @Inject
    public NotificationsViewModel(NotificationRepository nRepo) {
        this.nRepo = nRepo;

        notifications = nRepo.getNotifications();
        unseenNotificationCount = nRepo.getUnseenNotificationCount();
    }

    public MutableLiveData<List<Notification>> getNotifications() {
        return notifications;
    }

    public void getAllNotifications() {
        nRepo.getAllNotifications();
    }

    public MutableLiveData<Integer> getUnseenNotificationCount() {
        return unseenNotificationCount;
    }

    public void markAllNotificationsAsSeen() {
        nRepo.markAllNotificationsAsSeen();
    }

    public void deleteAllNotifications() {
        nRepo.deleteAllNotifications();
    }
}

