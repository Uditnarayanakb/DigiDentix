
# DigiDentix

How can IoT-enabled toothbrushes be leveraged to provide personalized dental insurance premiums based on individual brushing habits and frequency?



## Dental Insurance Reimagined
In recent years, there has been a significant increase in the use and development of Internet of Things devices.
One area that has seen promising advancements is the integration of IoT technology into dental care. The problem statement at hand is how IoT-enabled toothbrushes can be leveraged to provide personalized dental insurance premiums based on individual brushing habits and frequency.
To address this problem, we propose the use of IoT networks, connected intelligent toothbrushes, and data analytics techniques to gather clinically relevant information about individuals' brushing habits and frequency. The Internet of Dental Things allows dentistry equipment to gather and exchange data through software, sensors, embedded electronics, and networking connectivity. This data can be shared in real-time with dentists, enabling better preventive care and treatment strategies. By leveraging the data collected from IoT-enabled toothbrushes, dental insurance companies can gain valuable insights into individuals' oral health habits.
This information can be used to tailor personalized dental insurance premiums based on an individual's brushing habits and frequency.

## From Concept to Code
1. DentalHealth Class: This is a class that represents an individual's dental health. It has private
fields to store various parameters such as name, age, weight, gender, brushing duration,
brushing frequency, mouthwash usage, dietary habits, toothbrush replacement, tongue
cleaning, smoking, and alcohol consumption. It also has a constructor to initialize these fields
when an object of this class is created.

2. OralHealthScore() Method: This method calculates the oral health score based on the input
parameters. It checks various conditions such as brushing duration, brushing frequency,
mouthwash usage, dietary habits, toothbrush replacement, tongue cleaning, smoking, and
alcohol consumption to determine whether the oral health is good or needs improvement.

3. printPersonalDetails() Method: This method prints out the personal details of an individual,
including their name, age, weight, and gender.

4. DentalInsurance Class: This class is a subclass of DentalHealth and is used to calculate
dental insurance rates. It inherits the fields and methods from DentalHealth. Additionally, it
has a field called baseInsuranceAmount which represents the base insurance amount based on the individual's age.

5. calculateInsuranceAmount() Method: This method calculates the final insurance amount
based on the base insurance amount and the oral health score. If the oral health score is "Good
Oral Health," it reduces the insurance amount by 500, and if the oral health score indicates
"Needs Improvement in Oral Health," it increases the insurance amount by 500.

6. printInsuranceDetails() Method: This method prints out the insurance details, including the
base insurance amount, oral health score, and final insurance amount after calculation.

7. Main Program (demo Class): This is the main program that collects input from the user, such
as name, age, weight, gender, brushing duration, brushing frequency, and various yes/no
questions related to dental habits. It ensures that the input is valid and within specific ranges.

8. Object Creation: It creates an object of the DentalInsurance class with the provided input
parameters.

9. Printing Results: Finally, it calls the printPersonalDetails() and printInsuranceDetails()
methods to display the personal details and insurance details of the individual.
## Screenshots

![alt text](<Screenshot 2024-07-27 213047.png>)
![alt text](<Screenshot 2024-07-27 213256.png>) ![alt text](<Screenshot 2024-07-27 213227.png>) ![alt text](<Screenshot 2024-07-27 213245.png>)

## Conclusion
The provided Java program is designed to assess an individual's dental health and calculate dental
insurance rates based on various input parameters. Here's a conclusion summarizing its key
aspects:

Program Purpose:

 The program serves the purpose of evaluating an individual's oral health based on factors
such as brushing habits, dietary habits, smoking, alcohol consumption, and more.

Functionality:

It calculates an oral health score based on predefined conditions, determining whether the
individual's oral health is "Good" or "Needs Improvement."

 The program also calculates dental insurance rates based on the individual's age and oral health score. It adjusts the insurance rate either up or down based on oral health status.

User Input:

Users are prompted to enter personal details such as name, age, weight, and gender.

They are also asked about their dental habits, including brushing duration, brushing frequency, mouthwash usage, dietary habits, toothbrush replacement, tongue cleaning,
smoking, and alcohol consumption.

Output:

The program displays the individual's personal details, including name, age, weight, and gender.

It provides insurance details, including the base insurance amount, oral health score, and
final insurance amount after calculation.

Flexibility:

The program allows users to input their information, making it adaptable to different individuals' circumstances.

Improvements:

While the program achieves its goal of assessing dental health and insurance rates, it could
benefit from a more user-friendly interface and additional error handling to improve the user experience.

In conclusion, this Java program provides a basic framework for evaluating dental health and
insurance rates. However, further enhancements and refinements could be made to make it more
user-friendly and robust