# Composite Pattern - File System

## Pattern Overview
The Composite Pattern is a structural design pattern that allows you to treat individual objects and compositions of objects uniformly. It is useful when you want to represent part-whole hierarchies, such as a file system where directories can contain both files and subdirectories.

## Use Case - File System Representation
In this use case, a File System is represented where both File and Directory are components. A directory can contain files and other subdirectories, forming a tree structure. The Composite Pattern allows us to interact with this structure uniformly, whether it’s a file or a directory.

### Key Concepts:
- FileSystemComponent: The abstract base class for both files and directories.
- File: Represents a file (leaf node) in the file system.
- Directory: Represents a directory that can contain both files and other directories (composite node).

This use case demonstrates how the Composite Pattern simplifies tree structures like file systems by allowing uniform interaction with both individual files and directories, regardless of their complexity.
