# Use an official Arch Linux base image
FROM archlinux:latest

RUN pacman -Syu --noconfirm \
    && pacman -S --noconfirm jre-openjdk git vim

# Clone the repository and set the working directory
RUN cd / && \
    git clone https://github.com/hexaredecimal/hexarefolio.git && \
    cd hexarefolio

# Set the working directory
WORKDIR /hexarefolio

# Expose port 8080
EXPOSE 8080

# Run the Java application
CMD ["java", "-jar", " hexarefolioserver-dist.jar", "."]



