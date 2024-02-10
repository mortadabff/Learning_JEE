# The Observer pattern
The Observer pattern is a fundamental design pattern in object-oriented programming that enables an object, known as the subject, to maintain a list of its dependents, called observers, and automatically notify them of any state changes, usually by calling one of their methods. It is widely used in designing systems where multiple objects need to be informed about changes in an object, thus allowing for loosely coupled communication between these objects.

## Key Components of the Observer Pattern:
1. *Subject:* The object that holds important state information. It provides methods for adding or removing observers from its notification list.
2. *Observer:* Interface or abstract class defining the notification methods that must be implemented by concrete observers.
3. *ConcreteObserver:* Specific implementation of the observer that reacts to the subject's notifications.
## How It Works:
Subscription: Observers subscribe to the subject to receive notifications.
Notification: When a state change occurs in the subject, it notifies all subscribed observers by calling their update method.
Update: Each observer takes necessary actions in response to the notification.
# Concret example: Youtube notifications
in this Folder you will find a simple implementation od thi design pattern 
the subject is : Youtube channel
The observer is :   Observer interface 
The concret observer is : Subscriber 

*Simply : The subscriber is observing and when a channel add a new video, it can send automatically a notification to all subscribers ;* 