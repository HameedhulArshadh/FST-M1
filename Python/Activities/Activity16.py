class Car:
    def __init__(self, manufacturer, model, transmission, color):    
        self.manufacturer = manufacturer
        self.model = model
        self.transmission = transmission
        self.color = color
    
    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving!")

    def stop(self):
        print(f"{self.manufacturer} {self.model} is stopped!")


if __name__ == '__main__':
    Mustang = Car("Ford", "Mustang", "Manual", "Yellow")
    Chiron = Car("Bugatti", "Chiron", "Manual", "Black")
    Roadster = Car("Tesla", "Roadster", "Automatic", "Red")

    Mustang.accelerate()
    Mustang.stop()
    Chiron.accelerate()
    Chiron.stop()
    Roadster.accelerate()
    Roadster.stop()